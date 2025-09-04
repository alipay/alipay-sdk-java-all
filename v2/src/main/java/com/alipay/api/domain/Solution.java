package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 异常设备对应的处理方案
 *
 * @author auto create
 * @since 1.0, 2025-05-28 09:56:24
 */
public class Solution extends AlipayObject {

	private static final long serialVersionUID = 7758371697798461374L;

	/**
	 * 设备预计处理天数，如果超时会重新进行派单
	 */
	@ApiListField("available_pause_days")
	@ApiField("number")
	private List<Long> availablePauseDays;

	/**
	 * 每个异常点都有固定对应的处理方案，在同步工单数据时，会将对应的可选处理方案Solution进行同步，用于对方在处理工单时选择对应的具体方案。
	 */
	@ApiField("code")
	private String code;

	/**
	 * 对应处理方案描叙，在处理工单时，用于选择
	 */
	@ApiField("name")
	private String name;

	/**
	 * 不同的处理方案，要求是否一定必填处理意见，如果为true，则处理意见必填
	 */
	@ApiField("need_notes")
	private Boolean needNotes;

	public List<Long> getAvailablePauseDays() {
		return this.availablePauseDays;
	}
	public void setAvailablePauseDays(List<Long> availablePauseDays) {
		this.availablePauseDays = availablePauseDays;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Boolean getNeedNotes() {
		return this.needNotes;
	}
	public void setNeedNotes(Boolean needNotes) {
		this.needNotes = needNotes;
	}

}
