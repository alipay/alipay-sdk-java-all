package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 客户信用能力评估
 *
 * @author auto create
 * @since 1.0, 2018-10-12 11:19:11
 */
public class ZhimaCreditEpRatingInnerInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 5641929515922184815L;

	/**
	 * 企业信用类目，支持以下值：
ZMSCCO_4_1_1:快(服务效率)-快速收款-商家货款快收
ZMSCCO_4_2_1:快(服务效率)-快速理赔-多收多保
ZMSCCO_6_1_1:省(交易成本)-信用后付-设备先享后付
ZMSCCO_6_2_1:省(交易成本)-保证金保险-免保证金
	 */
	@ApiField("credit_category")
	private String creditCategory;

	/**
	 * 客户经营行业分类
	 */
	@ApiField("m_category")
	private String mCategory;

	/**
	 * 商户请求的唯一标志，64位长度的字母数字下划线组合。该标识作为对账的关键信息，商户要保证其唯一性。
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getCreditCategory() {
		return this.creditCategory;
	}
	public void setCreditCategory(String creditCategory) {
		this.creditCategory = creditCategory;
	}

	public String getmCategory() {
		return this.mCategory;
	}
	public void setmCategory(String mCategory) {
		this.mCategory = mCategory;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
