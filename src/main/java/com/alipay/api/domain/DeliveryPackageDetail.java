package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 包裹明细
 *
 * @author auto create
 * @since 1.0, 2018-06-01 17:20:31
 */
public class DeliveryPackageDetail extends AlipayObject {

	private static final long serialVersionUID = 2292643374195124383L;

	/**
	 * 运单号
	 */
	@ApiField("express_code")
	private String expressCode;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 货品编码
	 */
	@ApiField("goods_code")
	private String goodsCode;

	/**
	 * 货品数量
	 */
	@ApiField("goods_quantity")
	private String goodsQuantity;

	/**
	 * 包裹编号
	 */
	@ApiField("package_code")
	private String packageCode;

	public String getExpressCode() {
		return this.expressCode;
	}
	public void setExpressCode(String expressCode) {
		this.expressCode = expressCode;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getGoodsCode() {
		return this.goodsCode;
	}
	public void setGoodsCode(String goodsCode) {
		this.goodsCode = goodsCode;
	}

	public String getGoodsQuantity() {
		return this.goodsQuantity;
	}
	public void setGoodsQuantity(String goodsQuantity) {
		this.goodsQuantity = goodsQuantity;
	}

	public String getPackageCode() {
		return this.packageCode;
	}
	public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
	}

}
