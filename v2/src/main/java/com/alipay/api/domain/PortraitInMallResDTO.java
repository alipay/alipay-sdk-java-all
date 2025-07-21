package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商圈内用户画像
 *
 * @author auto create
 * @since 1.0, 2024-03-06 20:22:13
 */
public class PortraitInMallResDTO extends AlipayObject {

	private static final long serialVersionUID = 3137114923361429727L;

	/**
	 * 居住人口
	 */
	@ApiField("live_user")
	private PopulationDTO liveUser;

	/**
	 * 常驻人口
	 */
	@ApiField("settled_user")
	private PopulationDTO settledUser;

	/**
	 * 工作人口
	 */
	@ApiField("work_user")
	private PopulationDTO workUser;

	public PopulationDTO getLiveUser() {
		return this.liveUser;
	}
	public void setLiveUser(PopulationDTO liveUser) {
		this.liveUser = liveUser;
	}

	public PopulationDTO getSettledUser() {
		return this.settledUser;
	}
	public void setSettledUser(PopulationDTO settledUser) {
		this.settledUser = settledUser;
	}

	public PopulationDTO getWorkUser() {
		return this.workUser;
	}
	public void setWorkUser(PopulationDTO workUser) {
		this.workUser = workUser;
	}

}
