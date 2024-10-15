package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AntfarmUserOrnament;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antfarm.userornaments.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-24 10:02:02
 */
public class AlipaySocialAntfarmUserornamentsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4539121888989327493L;

	/** 
	 * 当前用户小鸡装扮信息
	 */
	@ApiListField("user_ornament_list")
	@ApiField("antfarm_user_ornament")
	private List<AntfarmUserOrnament> userOrnamentList;

	public void setUserOrnamentList(List<AntfarmUserOrnament> userOrnamentList) {
		this.userOrnamentList = userOrnamentList;
	}
	public List<AntfarmUserOrnament> getUserOrnamentList( ) {
		return this.userOrnamentList;
	}

}
