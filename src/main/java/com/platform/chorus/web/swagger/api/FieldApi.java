/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.7).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.platform.chorus.web.swagger.api;

import com.platform.chorus.web.swagger.model.ErrorResponseBody;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-04-13T03:43:08.909Z[GMT]")
@Api(value = "field", description = "the field API")
public interface FieldApi {

    @ApiOperation(value = "get all fields by given parameters", nickname = "getFields", notes = "get all fields given parameters", response = Object.class, tags={ "meta-field", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "return field list", response = Object.class),
        @ApiResponse(code = 500, message = "System internal error", response = ErrorResponseBody.class) })
    @RequestMapping(value = "/field/list",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Object> getFields(@ApiParam(value = "field number limit") @Valid @RequestParam(value = "limit", required = false) Integer limit,@ApiParam(value = "field number offset") @Valid @RequestParam(value = "offset", required = false) Integer offset,@ApiParam(value = "field owner id") @Valid @RequestParam(value = "owner", required = false) Integer owner,@ApiParam(value = "field name string pattern") @Valid @RequestParam(value = "name", required = false) String name,@ApiParam(value = "field type = class package + class name  matching pattern string") @Valid @RequestParam(value = "type", required = false) String type,@ApiParam(value = "field description matching pattern string") @Valid @RequestParam(value = "description", required = false) String description);

}
