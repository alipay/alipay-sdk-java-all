package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EntBasicInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dataproduct.fourelement.match response.
 * 
 * @author auto create
 * @since 1.0, 2024-01-11 14:07:00
 */
public class ZhimaCreditEpDataproductFourelementMatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 6675158493539261311L;

	/** 
	 * 企业四要素匹配展示的企业基本信息
	 */
	@ApiField("basic_info")
	private EntBasicInfo basicInfo;

	/** 
	 * 企业统一社会信用代码，和入参保持一致
	 */
	@ApiField("credit_code")
	private String creditCode;

	/** 
	 * 企业名称，和入参保持一致
	 */
	@ApiField("ent_name")
	private String entName;

	/** 
	 * 法人证件号，和入参保证一致
	 */
	@ApiField("fr_cert_no")
	private String frCertNo;

	/** 
	 * 法人姓名，和入参保证一致
	 */
	@ApiField("fr_name")
	private String frName;

	/** 
	 * 四要素匹配结果
	 */
	@ApiField("match_code")
	private String matchCode;

	/** 
	 * 用户输入了企业统一社会信用代码、法人姓名、法人证件号不匹配
	 */
	@ApiListField("match_result_columns")
	@ApiField("string")
	private List<String> matchResultColumns;

	/** 
	 * 企业注册号，和入参保持一致
	 */
	@ApiField("reg_no")
	private String regNo;

	public void setBasicInfo(EntBasicInfo basicInfo) {
		this.basicInfo = basicInfo;
	}
	public EntBasicInfo getBasicInfo( ) {
		return this.basicInfo;
	}

	public void setCreditCode(String creditCode) {
		this.creditCode = creditCode;
	}
	public String getCreditCode( ) {
		return this.creditCode;
	}

	public void setEntName(String entName) {
		this.entName = entName;
	}
	public String getEntName( ) {
		return this.entName;
	}

	public void setFrCertNo(String frCertNo) {
		this.frCertNo = frCertNo;
	}
	public String getFrCertNo( ) {
		return this.frCertNo;
	}

	public void setFrName(String frName) {
		this.frName = frName;
	}
	public String getFrName( ) {
		return this.frName;
	}

	public void setMatchCode(String matchCode) {
		this.matchCode = matchCode;
	}
	public String getMatchCode( ) {
		return this.matchCode;
	}

	public void setMatchResultColumns(List<String> matchResultColumns) {
		this.matchResultColumns = matchResultColumns;
	}
	public List<String> getMatchResultColumns( ) {
		return this.matchResultColumns;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getRegNo( ) {
		return this.regNo;
	}

}
