package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保险产品询价申请
 *
 * @author auto create
 * @since 1.0, 2019-08-26 16:45:52
 */
public class AlipayInsSceneProductInquiryApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1426152789547319545L;

	/**
	 * 保险产品的投保人,当产品价格和投保人有关时候需传值
	 */
	@ApiField("applicant")
	private InsPerson applicant;

	/**
	 * 投保业务参数，标准json格式支付串
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 份数
	 */
	@ApiField("copies_count")
	private String copiesCount;

	/**
	 * 保险被保人,产品价格和被保人相关时传值。
	 */
	@ApiListField("insureds")
	@ApiField("ins_person")
	private List<InsPerson> insureds;

	/**
	 * 询价流水号，标识一次询价请求
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 险种保障期限,数字+"Y/M/D"结尾,非固定期限险种或多固定期限险种必填
	 */
	@ApiField("period")
	private String period;

	/**
	 * 保险产品码，由保险产品小二分配
	 */
	@ApiField("prod_code")
	private String prodCode;

	/**
	 * 投保来源渠道，由保险产品小二分配
	 */
	@ApiField("source")
	private String source;

	/**
	 * 产品险种对应的保额(金额类型，单位为分，例如100000为1000元)。产品保额类型为金额时必传
	 */
	@ApiField("sum_insured")
	private Long sumInsured;

	public InsPerson getApplicant() {
		return this.applicant;
	}
	public void setApplicant(InsPerson applicant) {
		this.applicant = applicant;
	}

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getCopiesCount() {
		return this.copiesCount;
	}
	public void setCopiesCount(String copiesCount) {
		this.copiesCount = copiesCount;
	}

	public List<InsPerson> getInsureds() {
		return this.insureds;
	}
	public void setInsureds(List<InsPerson> insureds) {
		this.insureds = insureds;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPeriod() {
		return this.period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

	public String getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public Long getSumInsured() {
		return this.sumInsured;
	}
	public void setSumInsured(Long sumInsured) {
		this.sumInsured = sumInsured;
	}

}
