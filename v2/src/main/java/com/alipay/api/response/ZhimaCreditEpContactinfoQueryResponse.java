package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpContactInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.contactinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-15 15:12:01
 */
public class ZhimaCreditEpContactinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3178499753677943741L;

	/** 
	 * 企业联系方式列表
	 */
	@ApiField("data")
	private EpContactInfo data;

	/** 
	 * 企业名称
	 */
	@ApiField("ent_name")
	private String entName;

	/** 
	 * 企业注册号
	 */
	@ApiField("reg_no")
	private String regNo;

	/** 
	 * 企业18位统一社会信用代码
	 */
	@ApiField("uscc")
	private String uscc;

	public void setData(EpContactInfo data) {
		this.data = data;
	}
	public EpContactInfo getData( ) {
		return this.data;
	}

	public void setEntName(String entName) {
		this.entName = entName;
	}
	public String getEntName( ) {
		return this.entName;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getRegNo( ) {
		return this.regNo;
	}

	public void setUscc(String uscc) {
		this.uscc = uscc;
	}
	public String getUscc( ) {
		return this.uscc;
	}

}
