package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssetQrcodeInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.nfc.info.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-13 14:02:51
 */
public class AntMerchantExpandNfcInfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7359362548961753113L;

	/** 
	 * NFC链接对应的码值信息列表
	 */
	@ApiListField("nfc_info_list")
	@ApiField("asset_qrcode_info_d_t_o")
	private List<AssetQrcodeInfoDTO> nfcInfoList;

	public void setNfcInfoList(List<AssetQrcodeInfoDTO> nfcInfoList) {
		this.nfcInfoList = nfcInfoList;
	}
	public List<AssetQrcodeInfoDTO> getNfcInfoList( ) {
		return this.nfcInfoList;
	}

}
