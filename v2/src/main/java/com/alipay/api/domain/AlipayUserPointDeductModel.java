package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁会员积分扣减接口（需要用户授权）
 *
 * @author auto create
 * @since 1.0, 2020-06-23 20:00:17
 */
public class AlipayUserPointDeductModel extends AlipayObject {

	private static final long serialVersionUID = 6212947648329313682L;

	/**
	 * 蚂蚁会员平台上的权益所对应的编号
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 格式为yyyy-MM-dd HH:mm:ss ，业务操作时间用于对账，不传则以调用请求的当前时间计算
	 */
	@ApiField("biz_date")
	private Date bizDate;

	/**
	 * 业务大类，表明此次调用的来源，若无需要则不传。
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 业务流水号，会用于幂等性校验，所以请保证每次请求的业务流水号的唯一性
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 扣减积分时，该字段用于补充描述积分扣减的场景，将会拼在积分扣减记录的标题中进行展示，若无特殊需求则不要传该参数。明文长度不要超过32个中文汉字。
	 */
	@ApiField("prod_title")
	private String prodTitle;

	/**
	 * 业务子类型，表明业务来源实际操作的业务分类，若无需要则不传。
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	public Date getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(Date bizDate) {
		this.bizDate = bizDate;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProdTitle() {
		return this.prodTitle;
	}
	public void setProdTitle(String prodTitle) {
		this.prodTitle = prodTitle;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

}
