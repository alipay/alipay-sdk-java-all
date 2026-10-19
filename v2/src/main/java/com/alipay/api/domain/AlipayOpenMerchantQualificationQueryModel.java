package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户资质查询
 *
 * @author auto create
 * @since 1.0, 2026-10-10 16:06:23
 */
public class AlipayOpenMerchantQualificationQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5888495282455138383L;

	/**
	 * 渠道
	 */
	@ApiField("channel_code")
	private String channelCode;

	/**
	 * 例如千问要获取幸运咖的的资质，这里是填千问的oid
	 */
	@ApiField("oid")
	private String oid;

	/**
	 * open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 例如千问要获取幸运咖的的资质,这里是幸运咖的oid
	 */
	@ApiField("query_oid")
	private String queryOid;

	public String getChannelCode() {
		return this.channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getOid() {
		return this.oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getQueryOid() {
		return this.queryOid;
	}
	public void setQueryOid(String queryOid) {
		this.queryOid = queryOid;
	}

}
