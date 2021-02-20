/**
* OpenAPI Petstore
* This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.models

import org.openapitools.server.models.Category
import org.openapitools.server.models.Tag

import java.io.Serializable
/**
 * A pet for sale in the pet store
 * @param name 
 * @param photoUrls 
 * @param id 
 * @param category 
 * @param tags 
 * @param status pet status in the store
 */
data class Pet (
    val name: kotlin.String,
    val photoUrls: kotlin.Array<kotlin.String>,
    val id: kotlin.Long? = null,
    val category: Category? = null,
    val tags: kotlin.Array<Tag>? = null,
    /* pet status in the store */
    val status: Pet.Status? = null
) : Serializable 
{
    companion object {
        private const val serialVersionUID: Long = 123
    }
    /**
    * pet status in the store
    * Values: available,pending,sold
    */
    enum class Status(val value: kotlin.String){
        available("available"),
        pending("pending"),
        sold("sold");
    }
}

