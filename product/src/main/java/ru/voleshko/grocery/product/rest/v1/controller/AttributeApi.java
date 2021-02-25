/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package ru.voleshko.grocery.product.rest.v1.controller;

import com.querydsl.core.types.Predicate;
import io.swagger.annotations.*;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.data.web.SortDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.voleshko.grocery.product.domain.model.Attribute;
import ru.voleshko.grocery.product.rest.common.PageDto;
import ru.voleshko.grocery.product.rest.v1.dto.attribute.AttributeDto;
import ru.voleshko.grocery.product.rest.v1.dto.attribute.AttributeSaveDto;
import springfox.documentation.annotations.ApiIgnore;

import java.util.UUID;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-01-09T16:36:59.377Z")

@Api(value = "attribute", description = "the attribute API")
@RequestMapping(value = "v1")
public interface AttributeApi {

    @ApiOperation(value = "Find Attributes by parameters")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Attributes has been found") })
    @RequestMapping(value = "/attribute", method = RequestMethod.GET)
    ResponseEntity<PageDto<AttributeDto>> findAll(
            @QuerydslPredicate(root = Attribute.class) Predicate predicate,
            @ApiIgnore @SortDefault(sort = "name", direction = Sort.Direction.ASC) Pageable pageable
    );

    @ApiOperation(value = "Find Attribute by id", nickname = "attributeIdGet", notes = "", response = AttributeDto.class)
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Attribute found", response = AttributeDto.class),
        @ApiResponse(code = 404, message = "No Attribute found") })
    @RequestMapping(value = "/attribute/{id}", method = RequestMethod.GET)
    ResponseEntity<AttributeDto> findById(@ApiParam(value = "ID of Attribute",required=true) @PathVariable("id") UUID id);


    @ApiOperation(value = "Update Attribute", nickname = "attributeIdPut", notes = "", response = AttributeDto.class)
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Attribute has been updated", response = AttributeDto.class) })
    @RequestMapping(value = "/attribute/{id}", method = RequestMethod.PUT)
    ResponseEntity<AttributeDto> update(@ApiParam(value = "Updated Attribute" ,required=true )  @RequestBody AttributeSaveDto attribute, @ApiParam(value = "ID of Attribute being updated",required=true) @PathVariable("id") UUID id);


    @ApiOperation(value = "Create new Attribute", nickname = "attributePost", notes = "", response = AttributeDto.class)
    @ApiResponses(value = {
        @ApiResponse(code = 201, message = "Attribute has been created", response = AttributeDto.class) })
    @RequestMapping(value = "/attribute", method = RequestMethod.POST)
    ResponseEntity<AttributeDto> create(@ApiParam(value = "Attribute to be created" ,required=true )  @RequestBody AttributeSaveDto attribute);

}
