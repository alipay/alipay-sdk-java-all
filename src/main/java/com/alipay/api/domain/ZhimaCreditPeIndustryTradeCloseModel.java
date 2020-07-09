package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用服务产品交易关闭
 *
 * @author auto create
 * @since 1.0, 2019-05-16 11:34:53
 */
public class ZhimaCreditPeIndustryTradeCloseModel extends AlipayObject {

	private static final long serialVersionUID = 5791556179716354685L;

	/**
	 * 关闭时间,接入方通过其他渠道实际收款时间,应小于当前时间. 可空,不传将默认取服务器当前时间
	 */
	@ApiField("close_time")
	private String closeTime;

	/**
	 * 扩展信息字段，格式:json，注意，如果字符串对应的json对象包含中文字符，需要对包含中文的字段进行编码
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 操作类型,close:资金单关闭,finish:资金单完结,已经通过其他渠道完成交易
	 */
	@ApiField("operate")
	private String operate;

	/**
	 * 商户扣款时传入的扣款资金单号，需要保证唯一
	 */
	@ApiField("out_fund_no")
	private String outFundNo;

	/**
	 * 签约产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 平台订单号
	 */
	@ApiField("zm_order_id")
	private String zmOrderId;

	public String getCloseTime() {
		return this.closeTime;
	}
	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOperate() {
		return this.operate;
	}
	public void setOperate(String operate) {
		this.operate = operate;
	}

	public String getOutFundNo() {
		return this.outFundNo;
	}
	public void setOutFundNo(String outFundNo) {
		this.outFundNo = outFundNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getZmOrderId() {
		return this.zmOrderId;
	}
	public void setZmOrderId(String zmOrderId) {
		this.zmOrderId = zmOrderId;
	}

}
