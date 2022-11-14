package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝风控数据查询接口
 *
 * @author auto create
 * @since 1.0, 2017-04-10 11:36:36
 */
public class AlipaySecurityDataInfoSecuritydataQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5699419422293492632L;

	/**
	 * 业务代码.由蚂蚁金服定义的风控查询业务类型，例如: EX0001：查询风控黑名单，EX0002:查询地理信息数据
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 扩展参数,用于业务扩展入参,格式为json.注意由于嵌套在入参json中,引号需要转义,详见入参样式.
	 */
	@ApiField("ext")
	private String ext;

	/**
	 * 查询的主体值,例如身份证号: "210******019087",支持单个或者多个,多个以逗号分隔.主体值支持的数据类型目前有以下,跟type栏位定义的类型对应.
bank_card_no,银行卡号、
cert_no,身份证号码、
business_license_no,营业执照号码、
company_name, 公司名称，
phone,预留手机号
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 系统名称,标识接入机构内部部门的系统名 ,具体值需要与蚂蚁金服服务提供方约定.
	 */
	@ApiField("system_name")
	private String systemName;

	/**
	 * 查询参数类型,描述查询主体值类型.单次查询仅支持查询同一类型的主题值.
以黑名单业务为例:
bank_card_no,银行卡号、
cert_no,身份证号码、
business_license_no,营业执照号码、
company_name, 公司名称，
phone,预留手机号
	 */
	@ApiField("type")
	private String type;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getExt() {
		return this.ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSystemName() {
		return this.systemName;
	}
	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
