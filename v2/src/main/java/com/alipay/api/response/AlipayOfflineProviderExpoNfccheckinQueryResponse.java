package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.NfcExpoCheckPlaceItemVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.expo.nfccheckin.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-20 21:22:47
 */
public class AlipayOfflineProviderExpoNfccheckinQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3453337857953597546L;

	/** 
	 * 活动code
	 */
	@ApiField("activity_code")
	private String activityCode;

	/** 
	 * 外滩大会
	 */
	@ApiField("activity_name")
	private String activityName;

	/** 
	 * null
	 */
	@ApiListField("nfc_expo_check_place_item_vos")
	@ApiField("nfc_expo_check_place_item_v_o")
	private List<NfcExpoCheckPlaceItemVO> nfcExpoCheckPlaceItemVos;

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}
	public String getActivityCode( ) {
		return this.activityCode;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public String getActivityName( ) {
		return this.activityName;
	}

	public void setNfcExpoCheckPlaceItemVos(List<NfcExpoCheckPlaceItemVO> nfcExpoCheckPlaceItemVos) {
		this.nfcExpoCheckPlaceItemVos = nfcExpoCheckPlaceItemVos;
	}
	public List<NfcExpoCheckPlaceItemVO> getNfcExpoCheckPlaceItemVos( ) {
		return this.nfcExpoCheckPlaceItemVos;
	}

}
