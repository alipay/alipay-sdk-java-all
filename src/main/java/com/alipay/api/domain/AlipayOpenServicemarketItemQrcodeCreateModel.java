package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生成服务邀请订购签约授权二维码
 *
 * @author auto create
 * @since 1.0, 2019-07-23 12:21:08
 */
public class AlipayOpenServicemarketItemQrcodeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5356268266535985325L;

	/**
	 * 服务编码，ISV在服务市场上发布服务后生成的唯一服务Id，可以在我的服务列表中查看
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 某种外部业务编号，需要保证唯一，如售卖机机具号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 对商家收取的服务费率（%），0.38~0.6之间，精确到0.01
	 */
	@ApiField("rate")
	private Long rate;

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Long getRate() {
		return this.rate;
	}
	public void setRate(Long rate) {
		this.rate = rate;
	}

}
