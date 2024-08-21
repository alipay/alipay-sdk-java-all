package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商家信息
 *
 * @author auto create
 * @since 1.0, 2024-06-14 16:37:35
 */
public class JourneyMerchantInfo extends AlipayObject {

	private static final long serialVersionUID = 4717125126387543332L;

	/**
	 * 扩展信息
	 */
	@ApiListField("ext_info")
	@ApiField("order_ext_info")
	private List<OrderExtInfo> extInfo;

	/**
	 * 商户logo链接
	 */
	@ApiField("logo")
	private String logo;

	/**
	 * 商家名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 商家简称
	 */
	@ApiField("short_name")
	private String shortName;

	public List<OrderExtInfo> getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(List<OrderExtInfo> extInfo) {
		this.extInfo = extInfo;
	}

	public String getLogo() {
		return this.logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return this.shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

}
