package com.urbanestia.property.domain.port.country;

import com.urbanestia.property.domain.model.CountryModel;
import reactor.core.publisher.Mono;

public interface CreateCountryPort {
    Mono<CountryModel> createCountry(CountryModel countryModel);
}