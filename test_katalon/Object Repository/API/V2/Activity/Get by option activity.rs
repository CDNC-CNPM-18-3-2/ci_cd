<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Get by option activity</name>
   <tag></tag>
   <elementGuidId>18cb8454-d82e-4ac8-83ad-da78c5bf5c50</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <katalonVersion>8.3.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>${GlobalVariable.HOST_URL}/api/activity?key=${key}&amp;participants=${participants}&amp;price=${price}&amp;minprice=${minprice}&amp;maxprice=${maxprice}&amp;accessibility=${accessibility}&amp;minaccessibility=${minaccessibility}&amp;maxaccessibility=${maxaccessibility}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>6495d5df-9aba-4b24-92ca-798ac84e7a1b</id>
      <masked>false</masked>
      <name>key</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>32903cbf-9623-40ff-a3fb-0117386b0ea4</id>
      <masked>false</masked>
      <name>participants</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>02d60bc6-35a9-4b30-9701-90ba2ca17b54</id>
      <masked>false</masked>
      <name>price</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>e7ef9696-b185-4d01-8ed6-5458e9e00469</id>
      <masked>false</masked>
      <name>minprice</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>df563618-d470-4a6a-8e0b-2f6dc592faf1</id>
      <masked>false</masked>
      <name>maxprice</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>79995f18-33b9-4058-848b-b06484bebeb3</id>
      <masked>false</masked>
      <name>accessibility</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>49a7041b-20d1-48d0-b965-05baa3180248</id>
      <masked>false</masked>
      <name>minaccessibility</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>b0100f0d-886a-4f3f-ae08-9f853478882c</id>
      <masked>false</masked>
      <name>maxaccessibility</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
