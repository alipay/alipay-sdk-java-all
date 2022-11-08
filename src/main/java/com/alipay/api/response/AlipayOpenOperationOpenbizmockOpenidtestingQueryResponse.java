package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.UserDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.openbizmock.openidtesting.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-25 11:56:48
 */
public class AlipayOpenOperationOpenbizmockOpenidtestingQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1591888717523888779L;

	/** 
	 * 1
	 */
	@ApiField("result_extra_json")
	private String resultExtraJson;

	/** 
	 * 1
	 */
	@ApiField("result_extra_json_one")
	private String resultExtraJsonOne;

	/** 
	 * ceshi
	 */
	@ApiField("result_extra_json_one_original")
	private String resultExtraJsonOneOriginal;

	/** 
	 * 1
	 */
	@ApiField("result_extra_json_original")
	private String resultExtraJsonOriginal;

	/** 
	 * 1
	 */
	@ApiField("result_test")
	private String resultTest;

	/** 
	 * ceshi
	 */
	@ApiField("result_test_json")
	private String resultTestJson;

	/** 
	 * 2
	 */
	@ApiField("result_test_json_original")
	private String resultTestJsonOriginal;

	/** 
	 * 1
	 */
	@ApiField("result_test_original")
	private String resultTestOriginal;

	/** 
	 * ceshi
	 */
	@ApiField("result_test_wrong")
	private String resultTestWrong;

	/** 
	 * ceshi
	 */
	@ApiField("result_test_wrong_original")
	private String resultTestWrongOriginal;

	/** 
	 * 4
	 */
	@ApiField("result_user_detail")
	private UserDetail resultUserDetail;

	/** 
	 * 4
	 */
	@ApiField("result_user_detail_original")
	private String resultUserDetailOriginal;

	/** 
	 * 1
	 */
	@ApiField("result_user_id")
	private String resultUserId;

	/** 
	 * 1
	 */
	@ApiField("result_user_id_openid")
	private String resultUserIdOpenid;

	/** 
	 * 1
	 */
	@ApiField("result_user_id_original")
	private String resultUserIdOriginal;

	public void setResultExtraJson(String resultExtraJson) {
		this.resultExtraJson = resultExtraJson;
	}
	public String getResultExtraJson( ) {
		return this.resultExtraJson;
	}

	public void setResultExtraJsonOne(String resultExtraJsonOne) {
		this.resultExtraJsonOne = resultExtraJsonOne;
	}
	public String getResultExtraJsonOne( ) {
		return this.resultExtraJsonOne;
	}

	public void setResultExtraJsonOneOriginal(String resultExtraJsonOneOriginal) {
		this.resultExtraJsonOneOriginal = resultExtraJsonOneOriginal;
	}
	public String getResultExtraJsonOneOriginal( ) {
		return this.resultExtraJsonOneOriginal;
	}

	public void setResultExtraJsonOriginal(String resultExtraJsonOriginal) {
		this.resultExtraJsonOriginal = resultExtraJsonOriginal;
	}
	public String getResultExtraJsonOriginal( ) {
		return this.resultExtraJsonOriginal;
	}

	public void setResultTest(String resultTest) {
		this.resultTest = resultTest;
	}
	public String getResultTest( ) {
		return this.resultTest;
	}

	public void setResultTestJson(String resultTestJson) {
		this.resultTestJson = resultTestJson;
	}
	public String getResultTestJson( ) {
		return this.resultTestJson;
	}

	public void setResultTestJsonOriginal(String resultTestJsonOriginal) {
		this.resultTestJsonOriginal = resultTestJsonOriginal;
	}
	public String getResultTestJsonOriginal( ) {
		return this.resultTestJsonOriginal;
	}

	public void setResultTestOriginal(String resultTestOriginal) {
		this.resultTestOriginal = resultTestOriginal;
	}
	public String getResultTestOriginal( ) {
		return this.resultTestOriginal;
	}

	public void setResultTestWrong(String resultTestWrong) {
		this.resultTestWrong = resultTestWrong;
	}
	public String getResultTestWrong( ) {
		return this.resultTestWrong;
	}

	public void setResultTestWrongOriginal(String resultTestWrongOriginal) {
		this.resultTestWrongOriginal = resultTestWrongOriginal;
	}
	public String getResultTestWrongOriginal( ) {
		return this.resultTestWrongOriginal;
	}

	public void setResultUserDetail(UserDetail resultUserDetail) {
		this.resultUserDetail = resultUserDetail;
	}
	public UserDetail getResultUserDetail( ) {
		return this.resultUserDetail;
	}

	public void setResultUserDetailOriginal(String resultUserDetailOriginal) {
		this.resultUserDetailOriginal = resultUserDetailOriginal;
	}
	public String getResultUserDetailOriginal( ) {
		return this.resultUserDetailOriginal;
	}

	public void setResultUserId(String resultUserId) {
		this.resultUserId = resultUserId;
	}
	public String getResultUserId( ) {
		return this.resultUserId;
	}

	public void setResultUserIdOpenid(String resultUserIdOpenid) {
		this.resultUserIdOpenid = resultUserIdOpenid;
	}
	public String getResultUserIdOpenid( ) {
		return this.resultUserIdOpenid;
	}

	public void setResultUserIdOriginal(String resultUserIdOriginal) {
		this.resultUserIdOriginal = resultUserIdOriginal;
	}
	public String getResultUserIdOriginal( ) {
		return this.resultUserIdOriginal;
	}

}
