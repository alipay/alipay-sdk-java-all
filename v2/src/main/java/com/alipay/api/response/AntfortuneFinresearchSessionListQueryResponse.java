package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ZXZSessionDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.finresearch.session.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-20 10:37:02
 */
public class AntfortuneFinresearchSessionListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2121359644535793577L;

	/** 
	 * 会话列表
	 */
	@ApiListField("session_list")
	@ApiField("z_x_z_session_detail")
	private List<ZXZSessionDetail> sessionList;

	public void setSessionList(List<ZXZSessionDetail> sessionList) {
		this.sessionList = sessionList;
	}
	public List<ZXZSessionDetail> getSessionList( ) {
		return this.sessionList;
	}

}
