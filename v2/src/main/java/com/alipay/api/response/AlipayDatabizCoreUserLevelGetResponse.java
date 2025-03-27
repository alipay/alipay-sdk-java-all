package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlipayUserLevelInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.databiz.core.user.level.get response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 20:47:02
 */
public class AlipayDatabizCoreUserLevelGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4715934614195935683L;

	/** 
	 * 支付宝用户等级信息
	 */
	@ApiListField("user_level_infos")
	@ApiField("alipay_user_level_info")
	private List<AlipayUserLevelInfo> userLevelInfos;

	public void setUserLevelInfos(List<AlipayUserLevelInfo> userLevelInfos) {
		this.userLevelInfos = userLevelInfos;
	}
	public List<AlipayUserLevelInfo> getUserLevelInfos( ) {
		return this.userLevelInfos;
	}

}
