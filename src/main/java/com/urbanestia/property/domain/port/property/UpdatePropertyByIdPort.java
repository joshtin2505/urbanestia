package com.urbanestia.property.domain.port.property;

import com.urbanestia.property.domain.model.PropertyModel;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface UpdatePropertyByIdPort {
    Mono<PropertyModel> updatePropertyById(UUID id);

}
