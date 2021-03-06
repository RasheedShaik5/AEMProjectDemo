package com.adobe.aem.guides.wknd.spa.react.core.models.impl;


import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;



import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
@Model(adaptables = SlingHttpServletRequest.class,
    resourceType = MySPAComponent.RESOURCE_TYPE,
    adapters = {MySPAComponent.class, ComponentExporter.class},
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class MySPAComponent implements ComponentExporter {
  protected static final String RESOURCE_TYPE = "apps/wknd-spa-react/components/mySPAComponent";
  @ValueMapValue(name = "heading")
  private String heading;
  @ValueMapValue(name = "headingType")
  private String headingType;
  @ValueMapValue(name = "headingColor")
  private String headingColor;
  public String getHeading() {
    return heading;
  }
  public String getHeadingType() {
    return headingType;
  }
  public String getHeadingColor() {
    return headingColor;
  }
  
  @Override
  public String getExportedType() {
    return RESOURCE_TYPE;
  }
}