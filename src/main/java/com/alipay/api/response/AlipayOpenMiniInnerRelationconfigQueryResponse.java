package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MiniAppRelationItemVo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.inner.relationconfig.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-27 12:26:41
 */
public class AlipayOpenMiniInnerRelationconfigQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7221685416279587159L;

	/** 
	 * 允许所有小程序跳转
	 */
	@ApiField("unlimited")
	private Boolean unlimited;

	/** 
	 * 互跳白名单列表
	 */
	@ApiListField("white_list")
	@ApiField("mini_app_relation_item_vo")
	private List<MiniAppRelationItemVo> whiteList;

	public void setUnlimited(Boolean unlimited) {
		this.unlimited = unlimited;
	}
	public Boolean getUnlimited( ) {
		return this.unlimited;
	}

	public void setWhiteList(List<MiniAppRelationItemVo> whiteList) {
		this.whiteList = whiteList;
	}
	public List<MiniAppRelationItemVo> getWhiteList( ) {
		return this.whiteList;
	}

}
