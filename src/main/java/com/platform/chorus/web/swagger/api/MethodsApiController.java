package com.platform.chorus.web.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-04-13T03:43:08.909Z[GMT]")
@Controller
public class MethodsApiController implements MethodsApi {

    private static final Logger log = LoggerFactory.getLogger(MethodsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public MethodsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Object> getMethods(@ApiParam(value = "field number limit") @Valid @RequestParam(value = "limit", required = false) Integer limit,@ApiParam(value = "field number offset") @Valid @RequestParam(value = "offset", required = false) Integer offset,@ApiParam(value = "field owner id") @Valid @RequestParam(value = "owner", required = false) Integer owner,@ApiParam(value = "field name string pattern") @Valid @RequestParam(value = "name", required = false) String name,@ApiParam(value = "field type = class package + class name  matching pattern string") @Valid @RequestParam(value = "result", required = false) String result,@ApiParam(value = "field description matching pattern string") @Valid @RequestParam(value = "argument", required = false) String argument,@ApiParam(value = "field description matching pattern string") @Valid @RequestParam(value = "description", required = false) String description) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

}
