package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询可推广渠道
 *
 * @author auto create
 * @since 1.0, 2022-04-20 15:01:51
 */
public class AlipayMarketingActivityDeliverychannelQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5738763356665176914L;

	/**
	 * 当前服务商所代理的商户信息.

在查询可投放的渠道信息时，会使用商户信息来进行渠道权限、准入等条件的判断.

如果属于商户自运营，则该对象可以不填写。

如果属于服务商自运营，则对象中的businessType设置为ISV模式.默认使用当前操作人的信息作为商户信息

如果属于服务商代运营模式，则对象中的businessType设置为ISV_FOR_MERCHANT模式
	 */
	@ApiField("belong_merchant_info")
	private DeliveryAgencyMerchantInfo belongMerchantInfo;

	/**
	 * 展位码。

boothCode含义：boothCode表达的是某个渠道可以投放的展位码。例如：支付结果页PAY_RESULT

枚举值：
PAY_RESULT：支付结果页。

后续新增可投放的展位后，会在文档中新增描述信息
	 */
	@ApiField("booth_code")
	private String boothCode;

	/**
	 * 查询的页码。

特别说明：
页码从1开始。
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页查询的个数，最大值为 100。
	 */
	@ApiField("page_size")
	private Long pageSize;

	public DeliveryAgencyMerchantInfo getBelongMerchantInfo() {
		return this.belongMerchantInfo;
	}
	public void setBelongMerchantInfo(DeliveryAgencyMerchantInfo belongMerchantInfo) {
		this.belongMerchantInfo = belongMerchantInfo;
	}

	public String getBoothCode() {
		return this.boothCode;
	}
	public void setBoothCode(String boothCode) {
		this.boothCode = boothCode;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
