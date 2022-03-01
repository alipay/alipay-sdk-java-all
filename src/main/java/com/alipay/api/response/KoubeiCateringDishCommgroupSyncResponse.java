package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.KbdishCommGroupInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.commgroup.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-04 10:38:19
 */
public class KoubeiCateringDishCommgroupSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3726613969484162458L;

	/** 
	 * 通用分组的id,标示组结构的唯一id
	 */
	@ApiField("comm_group_id")
	private String commGroupId;

	/** 
	 * 客制化组模型，新增和更新的时候传出
	 */
	@ApiField("kbdish_comm_group_info")
	private KbdishCommGroupInfo kbdishCommGroupInfo;

	public void setCommGroupId(String commGroupId) {
		this.commGroupId = commGroupId;
	}
	public String getCommGroupId( ) {
		return this.commGroupId;
	}

	public void setKbdishCommGroupInfo(KbdishCommGroupInfo kbdishCommGroupInfo) {
		this.kbdishCommGroupInfo = kbdishCommGroupInfo;
	}
	public KbdishCommGroupInfo getKbdishCommGroupInfo( ) {
		return this.kbdishCommGroupInfo;
	}

}
