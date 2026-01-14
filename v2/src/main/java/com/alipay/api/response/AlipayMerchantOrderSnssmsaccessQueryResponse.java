package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AccessSceneUrl;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.order.snssmsaccess.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-04 14:47:20
 */
public class AlipayMerchantOrderSnssmsaccessQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8169586596436384827L;

	/** 
	 * 商户准入地址
	 */
	@ApiListField("access_scene_url_info")
	@ApiField("access_scene_url")
	private List<AccessSceneUrl> accessSceneUrlInfo;

	/** 
	 * 准入标志
	 */
	@ApiField("valid_access_flag")
	private Boolean validAccessFlag;

	public void setAccessSceneUrlInfo(List<AccessSceneUrl> accessSceneUrlInfo) {
		this.accessSceneUrlInfo = accessSceneUrlInfo;
	}
	public List<AccessSceneUrl> getAccessSceneUrlInfo( ) {
		return this.accessSceneUrlInfo;
	}

	public void setValidAccessFlag(Boolean validAccessFlag) {
		this.validAccessFlag = validAccessFlag;
	}
	public Boolean getValidAccessFlag( ) {
		return this.validAccessFlag;
	}

}
