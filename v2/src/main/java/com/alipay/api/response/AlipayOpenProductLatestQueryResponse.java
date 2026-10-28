package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AbilityItem;
import com.alipay.api.domain.MiniAppInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.product.latest.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-10 16:12:58
 */
public class AlipayOpenProductLatestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8854657512728536785L;

	/** 
	 * null
	 */
	@ApiListField("abilities")
	@ApiField("ability_item")
	private List<AbilityItem> abilities;

	/** 
	 * 交互协议
	 */
	@ApiField("interaction_protocol")
	private String interactionProtocol;

	/** 
	 * null
	 */
	@ApiListField("mini_apps")
	@ApiField("mini_app_info")
	private List<MiniAppInfo> miniApps;

	/** 
	 * 产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/** 
	 * 产品版本
	 */
	@ApiField("product_version")
	private String productVersion;

	public void setAbilities(List<AbilityItem> abilities) {
		this.abilities = abilities;
	}
	public List<AbilityItem> getAbilities( ) {
		return this.abilities;
	}

	public void setInteractionProtocol(String interactionProtocol) {
		this.interactionProtocol = interactionProtocol;
	}
	public String getInteractionProtocol( ) {
		return this.interactionProtocol;
	}

	public void setMiniApps(List<MiniAppInfo> miniApps) {
		this.miniApps = miniApps;
	}
	public List<MiniAppInfo> getMiniApps( ) {
		return this.miniApps;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}
	public String getProductVersion( ) {
		return this.productVersion;
	}

}
