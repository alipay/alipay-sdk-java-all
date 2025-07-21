package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV生态供应商查询返佣账单信息接口
 *
 * @author auto create
 * @since 1.0, 2025-04-30 15:41:57
 */
public class AntMerchantExpandEcoBillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4237221495832365946L;

	/**
	 * 出账日期
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * 生态供应商编号
	 */
	@ApiField("eco_code")
	private String ecoCode;

	/**
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 生态供应商店铺编号
	 */
	@ApiField("shop_code")
	private String shopCode;

	public String getBillDate() {
		return this.billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getEcoCode() {
		return this.ecoCode;
	}
	public void setEcoCode(String ecoCode) {
		this.ecoCode = ecoCode;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public String getShopCode() {
		return this.shopCode;
	}
	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}

}
