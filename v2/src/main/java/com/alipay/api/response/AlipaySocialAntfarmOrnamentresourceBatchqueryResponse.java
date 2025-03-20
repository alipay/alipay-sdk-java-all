package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AntfarmOrnamentResource;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antfarm.ornamentresource.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-24 10:02:01
 */
public class AlipaySocialAntfarmOrnamentresourceBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1426297571865478239L;

	/** 
	 * 蚂蚁庄园装扮资源
	 */
	@ApiListField("ornament_resource_list")
	@ApiField("antfarm_ornament_resource")
	private List<AntfarmOrnamentResource> ornamentResourceList;

	/** 
	 * spine资源地址
	 */
	@ApiField("spine_resource_url")
	private String spineResourceUrl;

	public void setOrnamentResourceList(List<AntfarmOrnamentResource> ornamentResourceList) {
		this.ornamentResourceList = ornamentResourceList;
	}
	public List<AntfarmOrnamentResource> getOrnamentResourceList( ) {
		return this.ornamentResourceList;
	}

	public void setSpineResourceUrl(String spineResourceUrl) {
		this.spineResourceUrl = spineResourceUrl;
	}
	public String getSpineResourceUrl( ) {
		return this.spineResourceUrl;
	}

}
