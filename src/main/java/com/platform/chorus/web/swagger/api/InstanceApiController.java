package com.platform.chorus.web.swagger.api;

import com.platform.chorus.web.swagger.model.Instance;
import com.platform.chorus.web.swagger.model.SuccessResponseBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-04-13T03:43:08.909Z[GMT]")
@Controller
public class InstanceApiController implements InstanceApi {

    private static final Logger log = LoggerFactory.getLogger(InstanceApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public InstanceApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Object> createInstance(@ApiParam(value = "instance content" ,required=true )  @Valid @RequestBody List<Instance> body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SuccessResponseBody> getInstance(@NotNull @ApiParam(value = "ID of class", required = true) @Valid @RequestParam(value = "id", required = true) Integer id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<SuccessResponseBody>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> getInstanceByParameters(@ApiParam(value = "class number limit") @Valid @RequestParam(value = "limit", required = false) Integer limit,@ApiParam(value = "class number offset") @Valid @RequestParam(value = "offset", required = false) Integer offset,@ApiParam(value = "class name string pattern") @Valid @RequestParam(value = "name", required = false) String name,@ApiParam(value = "class type string pattern") @Valid @RequestParam(value = "type", required = false) String type,@ApiParam(value = "class type string pattern") @Valid @RequestParam(value = "content", required = false) String content) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

}
