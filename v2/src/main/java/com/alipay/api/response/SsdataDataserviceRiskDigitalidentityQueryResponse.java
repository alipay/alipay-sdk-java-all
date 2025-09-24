package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.risk.digitalidentity.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-05 15:47:44
 */
public class SsdataDataserviceRiskDigitalidentityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1498374671296655633L;

	/** 
	 * 盗卡盗账户概率，用于识别账号被盗的风险，数值越大风险概率越大，范围0~1，小数点后保留6有效数
	 */
	@ApiField("ato_score")
	private String atoScore;

	/** 
	 * 设备ID，设备的唯一识别号
	 */
	@ApiField("deviceid")
	private String deviceid;

	/** 
	 * 是否模拟器登陆
	 */
	@ApiField("emulator")
	private Boolean emulator;

	/** 
	 * 身份被冒用概率，用于识别账号被冒用风险，数值越大风险概率越大，范围0~1，小数点后保留6有效数
	 */
	@ApiField("fake_score")
	private String fakeScore;

	/** 
	 * IOS true：越狱 false：非越狱         
android true:有root权限  false：无root权限
	 */
	@ApiField("root")
	private Boolean root;

	/** 
	 * 垃圾账户概率，用于识别垃圾账户的风险，数值越大风险概率越大，范围0~1，小数点后保留6有效数
	 */
	@ApiField("rub_score")
	private String rubScore;

	/** 
	 * 调用订单号
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public void setAtoScore(String atoScore) {
		this.atoScore = atoScore;
	}
	public String getAtoScore( ) {
		return this.atoScore;
	}

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}
	public String getDeviceid( ) {
		return this.deviceid;
	}

	public void setEmulator(Boolean emulator) {
		this.emulator = emulator;
	}
	public Boolean getEmulator( ) {
		return this.emulator;
	}

	public void setFakeScore(String fakeScore) {
		this.fakeScore = fakeScore;
	}
	public String getFakeScore( ) {
		return this.fakeScore;
	}

	public void setRoot(Boolean root) {
		this.root = root;
	}
	public Boolean getRoot( ) {
		return this.root;
	}

	public void setRubScore(String rubScore) {
		this.rubScore = rubScore;
	}
	public String getRubScore( ) {
		return this.rubScore;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getUniqueId( ) {
		return this.uniqueId;
	}

}
