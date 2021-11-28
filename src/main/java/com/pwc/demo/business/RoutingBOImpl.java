package com.pwc.demo.business;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pwc.demo.models.Country;
import org.springframework.stereotype.Service;
import utils.ListUtils;

import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static utils.Constants.AN_ERROR_HAS_OCCURRED;

@Service
public class RoutingBOImpl implements RoutingBO {

    private static final String COUNTRIES_DATA_URL = "https://raw.githubusercontent.com/mledoze/countries/master/countries.json";

    private List<Country> countryList;

    @Override
    public List<String> searchRoutingFromOriginToDestination(String origin, String destination) {

        this.countryList = this.getAllCountries();

        Country countryOrigin = this.getCountryByCode(origin.toUpperCase());
        Country countryDestination = this.getCountryByCode(destination.toUpperCase());

        List<String> borderCrossings = null;

        if(Objects.nonNull(countryOrigin) && Objects.nonNull(countryDestination)) {
            // retrieve border crossings between origin and destination
            borderCrossings = countryOrigin.getBorders().stream()
                    .filter(countryDestination.getBorders()::contains)
                    .limit(1)
                    .collect(Collectors.toList());
        }

        return !ListUtils.isNullOrEmpty(borderCrossings)
                ? Arrays.asList(origin, borderCrossings.get(0), destination)
                : null;
    }

    /**
     * retrieves countries info from external source
     *
     * @return countries info list
     */
    private List<Country> getAllCountries() {
        try {
            // Connect to the URL using java's native library
            URL url = new URL(COUNTRIES_DATA_URL);
            URLConnection request = url.openConnection();
            request.connect();

            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(url, new TypeReference<List<Country>>(){});

        } catch (Exception ex) {
            throw new RuntimeException(AN_ERROR_HAS_OCCURRED);
        }
    }

    /**
     * responsible to get country info by country identification (cca3)
     *
     * @param code country code identification (cca3)
     *
     * @return country info
     * */
    private Country getCountryByCode(String code) {
        return this.countryList.stream()
                .filter(country -> country.getCca3().equals(code))
                .findFirst().orElse(null);
    }
}
