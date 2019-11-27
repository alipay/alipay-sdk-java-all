package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iyuoiuyuiyi
 *
 * @author auto create
 * @since 1.0, 2018-05-30 11:53:50
 */
public class AlipaySecurityProdTradeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3217265276262773566L;

	/**
	 * 我是之旋测试用的，不用填写
	 */
	@ApiField("image_type")
	private AAATest imageType;

	/**
	 * 测试用的
	 */
	@ApiField("test_oder_id")
	private GoodsDetail testOderId;

	/**
	 * 参数描述必须通俗易懂、无错别字、完整。描述的内容请按此格式填写：参数名+是adfaf否唯一(如需)+应用场景+枚举值(如有)+如何获取+特殊说明(如有)。如不符合标准终审会驳回，影响上线时间。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public AAATest getImageType() {
		return this.imageType;
	}
	public void setImageType(AAATest imageType) {
		this.imageType = imageType;
	}

	public GoodsDetail getTestOderId() {
		return this.testOderId;
	}
	public void setTestOderId(GoodsDetail testOderId) {
		this.testOderId = testOderId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
