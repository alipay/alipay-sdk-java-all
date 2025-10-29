package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MiniappCloudDetailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.cloud.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:34
 */
public class AlipayOpenMiniCloudDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1462428863216361957L;

	/** 
	 * 用户金融云展示的小程序信息列表
	 */
	@ApiListField("miniapp_cloud_detail_info_list")
	@ApiField("miniapp_cloud_detail_info")
	private List<MiniappCloudDetailInfo> miniappCloudDetailInfoList;

	/** 
	 * partner_id，如果只传入了APPID，返回该appid的pid
	 */
	@ApiField("partner_id")
	private String partnerId;

	public void setMiniappCloudDetailInfoList(List<MiniappCloudDetailInfo> miniappCloudDetailInfoList) {
		this.miniappCloudDetailInfoList = miniappCloudDetailInfoList;
	}
	public List<MiniappCloudDetailInfo> getMiniappCloudDetailInfoList( ) {
		return this.miniappCloudDetailInfoList;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId( ) {
		return this.partnerId;
	}

}
