package com.doherty.shipmentmicroservice.services;

import com.doherty.shipmentmicroservice.model.LineItemSummary;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "order-microservice")
@Component
public interface LineItemService {

    @RequestMapping(value = "/lineItems/{lineItemId}/assign/{shipmentId}", method = RequestMethod.POST)
    void assignShipmentToLineItems(@PathVariable("lineItemId") Long lineItemId, @PathVariable("shipmentId") Long shipmentId);

    @RequestMapping(value = "/lineItems/{id}/summary", method = RequestMethod.GET)
    LineItemSummary getLineItemSummary(@PathVariable("id") Long id);

}
