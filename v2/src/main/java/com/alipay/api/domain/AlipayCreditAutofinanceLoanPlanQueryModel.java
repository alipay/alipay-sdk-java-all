package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询贷款方案
 *
 * @author auto create
 * @since 1.0, 2016-10-17 16:44:56
 */
public class AlipayCreditAutofinanceLoanPlanQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4415888839324274286L;

	/**
	 * 扩展参数,针对不同的平台特殊业务场景，将需要的参数填入改字段，目前针对大搜车业务有以下参数：itemprice 车辆价格，lastprop 车辆残值率,extintamt 基础服务包+增值服务包，loantenor 贷款期数，creditamtprop 授信额度比例调整值；
	 */
	@ApiField("extparam")
	private String extparam;

	/**
	 * 机构编码，机构接入汽车金融平台时分配，固定值
	 */
	@ApiField("orgcode")
	private String orgcode;

	/**
	 * 产品编码，汽车金融平台给机构提供的产品编码
	 */
	@ApiField("productcode")
	private String productcode;

	/**
	 * 本次请求流水号，全局唯一
	 */
	@ApiField("seqno")
	private String seqno;

	/**
	 * 支付宝账号数字ID
	 */
	@ApiField("uid")
	private String uid;

	public String getExtparam() {
		return this.extparam;
	}
	public void setExtparam(String extparam) {
		this.extparam = extparam;
	}

	public String getOrgcode() {
		return this.orgcode;
	}
	public void setOrgcode(String orgcode) {
		this.orgcode = orgcode;
	}

	public String getProductcode() {
		return this.productcode;
	}
	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public String getSeqno() {
		return this.seqno;
	}
	public void setSeqno(String seqno) {
		this.seqno = seqno;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
