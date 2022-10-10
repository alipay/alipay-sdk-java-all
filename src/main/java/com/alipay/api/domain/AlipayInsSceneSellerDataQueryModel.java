package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家保障中心数据服务
 *
 * @author auto create
 * @since 1.0, 2020-02-21 17:57:43
 */
public class AlipayInsSceneSellerDataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8566514324573172883L;

	/**
	 * 目标服务名称
	 */
	@ApiField("dx_name")
	private String dxName;

	/**
	 * 扩展字段
	 */
	@ApiField("extra_data")
	private String extraData;

	/**
	 * 机构产品号
	 */
	@ApiField("prod_no")
	private String prodNo;

	/**
	 * 标准产品号
	 */
	@ApiField("sp_no")
	private String spNo;

	public String getDxName() {
		return this.dxName;
	}
	public void setDxName(String dxName) {
		this.dxName = dxName;
	}

	public String getExtraData() {
		return this.extraData;
	}
	public void setExtraData(String extraData) {
		this.extraData = extraData;
	}

	public String getProdNo() {
		return this.prodNo;
	}
	public void setProdNo(String prodNo) {
		this.prodNo = prodNo;
	}

	public String getSpNo() {
		return this.spNo;
	}
	public void setSpNo(String spNo) {
		this.spNo = spNo;
	}

}
