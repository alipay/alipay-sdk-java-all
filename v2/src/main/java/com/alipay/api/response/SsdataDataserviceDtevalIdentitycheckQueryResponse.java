package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.dteval.identitycheck.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:39
 */
public class SsdataDataserviceDtevalIdentitycheckQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4239682222518173212L;

	/** 
	 * evidence：关联人的手机号是否和该用户通话以及通话次数
	 */
	@ApiField("evidence")
	private String evidence;

	/** 
	 * ext_map:额外参数，预留
	 */
	@ApiField("ext_map")
	private String extMap;

	/** 
	 * id_card_no_match_flag:身份证号匹配结果标识，表示传入的身份证号是否匹配，含四种状态：完全匹配成功（MATCHSUCCESS），模糊匹配成功（FUZZYMATCHSUCCESS），匹配失败（MATCHFAIL），无数据（NODATA）
	 */
	@ApiField("id_card_no_match_flag")
	private String idCardNoMatchFlag;

	/** 
	 * name_match_flag:姓名匹配标识，表示传入的姓名是否匹配，含四种状态：完全匹配成功（MATCHSUCCESS），模糊匹配成功（FUZZYMATCHSUCCESS），匹配失败（MATCHFAIL），无数据（NODATA）
	 */
	@ApiField("name_match_flag")
	private String nameMatchFlag;

	/** 
	 * push_ant_data_flag:是否推送蚂蚁数据标志,推送成功返回true，失败返回false
	 */
	@ApiField("push_ant_data_flag")
	private String pushAntDataFlag;

	public void setEvidence(String evidence) {
		this.evidence = evidence;
	}
	public String getEvidence( ) {
		return this.evidence;
	}

	public void setExtMap(String extMap) {
		this.extMap = extMap;
	}
	public String getExtMap( ) {
		return this.extMap;
	}

	public void setIdCardNoMatchFlag(String idCardNoMatchFlag) {
		this.idCardNoMatchFlag = idCardNoMatchFlag;
	}
	public String getIdCardNoMatchFlag( ) {
		return this.idCardNoMatchFlag;
	}

	public void setNameMatchFlag(String nameMatchFlag) {
		this.nameMatchFlag = nameMatchFlag;
	}
	public String getNameMatchFlag( ) {
		return this.nameMatchFlag;
	}

	public void setPushAntDataFlag(String pushAntDataFlag) {
		this.pushAntDataFlag = pushAntDataFlag;
	}
	public String getPushAntDataFlag( ) {
		return this.pushAntDataFlag;
	}

}
