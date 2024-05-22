package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.IotFmInsuCityVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.iotfm.usersimpleinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:34:26
 */
public class AlipayCommerceMedicalIotfmUsersimpleinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6177714213612857754L;

	/** 
	 * 默认参保地市编码国标
	 */
	@ApiField("fm_city_code")
	private String fmCityCode;

	/** 
	 * 默认参保地市编码机构
	 */
	@ApiField("fm_ins_city_code")
	private String fmInsCityCode;

	/** 
	 * 参保地列表
	 */
	@ApiListField("fm_insu_city_list")
	@ApiField("iot_fm_insu_city_v_o")
	private List<IotFmInsuCityVO> fmInsuCityList;

	/** 
	 * 子账户用户openid
	 */
	@ApiField("fm_open_id")
	private String fmOpenId;

	/** 
	 * 子账户用户uid
	 */
	@ApiField("fm_user_id")
	private String fmUserId;

	/** 
	 * 子账户脱敏姓名
	 */
	@ApiField("fm_user_name")
	private String fmUserName;

	public void setFmCityCode(String fmCityCode) {
		this.fmCityCode = fmCityCode;
	}
	public String getFmCityCode( ) {
		return this.fmCityCode;
	}

	public void setFmInsCityCode(String fmInsCityCode) {
		this.fmInsCityCode = fmInsCityCode;
	}
	public String getFmInsCityCode( ) {
		return this.fmInsCityCode;
	}

	public void setFmInsuCityList(List<IotFmInsuCityVO> fmInsuCityList) {
		this.fmInsuCityList = fmInsuCityList;
	}
	public List<IotFmInsuCityVO> getFmInsuCityList( ) {
		return this.fmInsuCityList;
	}

	public void setFmOpenId(String fmOpenId) {
		this.fmOpenId = fmOpenId;
	}
	public String getFmOpenId( ) {
		return this.fmOpenId;
	}

	public void setFmUserId(String fmUserId) {
		this.fmUserId = fmUserId;
	}
	public String getFmUserId( ) {
		return this.fmUserId;
	}

	public void setFmUserName(String fmUserName) {
		this.fmUserName = fmUserName;
	}
	public String getFmUserName( ) {
		return this.fmUserName;
	}

}
