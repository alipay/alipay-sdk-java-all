package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户门店信息模型
 *
 * @author auto create
 * @since 1.0, 2020-09-24 11:36:59
 */
public class SubMerchantEnterOpenModel extends AlipayObject {

	private static final long serialVersionUID = 1519637335189747484L;

	/**
	 * 扩展字段，为json字符串格式；入驻缴费后开票的产品如果需要传入自定义开票链接，由此字段传入。
	 */
	@ApiField("extend_fields")
	private String extendFields;

	/**
	 * 商户行业，枚举值如下：subway：地铁，etc：ETC，online_car_hailing：网约车，catering：餐饮，hotel：酒店，convenience_store：便利店，oil：加油，insurance：保险，service_provider：运营商，life_payment：生活缴费，political：政务，other：其他
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 开票商户pid，入驻支付即开票场景的时候，该字段必传
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 商户门店税号。
	 */
	@ApiField("register_no")
	private String registerNo;

	/**
	 * 商户门店全称。
	 */
	@ApiField("sub_m_name")
	private String subMName;

	/**
	 * 商户门店简称，只能由大写字母、下划线、数字组成，且必须以大写字母开头。
	 */
	@ApiField("sub_m_short_name")
	private String subMShortName;

	public String getExtendFields() {
		return this.extendFields;
	}
	public void setExtendFields(String extendFields) {
		this.extendFields = extendFields;
	}

	public String getIndustry() {
		return this.industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getRegisterNo() {
		return this.registerNo;
	}
	public void setRegisterNo(String registerNo) {
		this.registerNo = registerNo;
	}

	public String getSubMName() {
		return this.subMName;
	}
	public void setSubMName(String subMName) {
		this.subMName = subMName;
	}

	public String getSubMShortName() {
		return this.subMShortName;
	}
	public void setSubMShortName(String subMShortName) {
		this.subMShortName = subMShortName;
	}

}
