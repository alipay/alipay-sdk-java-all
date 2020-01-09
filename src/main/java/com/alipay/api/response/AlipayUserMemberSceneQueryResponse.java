package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.member.scene.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-05-27 16:34:25
 */
public class AlipayUserMemberSceneQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5151347492459272444L;

	/** 
	 * 用户在指定场景下的状态信息结果
在COLLEGE_LIFE场景下：0表示和大学生用户人群的兴趣喜好不匹配，1表示和大学生用户人群的兴趣喜好匹配
	 */
	@ApiField("state")
	private Long state;

	public void setState(Long state) {
		this.state = state;
	}
	public Long getState( ) {
		return this.state;
	}

}
