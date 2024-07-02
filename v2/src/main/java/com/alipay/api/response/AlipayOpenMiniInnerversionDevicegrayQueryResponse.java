package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MiniAppGrayGroupDto;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerversion.devicegray.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-23 20:26:46
 */
public class AlipayOpenMiniInnerversionDevicegrayQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8383821314851731347L;

	/** 
	 * 设备号列表
	 */
	@ApiListField("device_no_list")
	@ApiField("string")
	private List<String> deviceNoList;

	/** 
	 * 分组信息列表
	 */
	@ApiListField("gray_groups")
	@ApiField("mini_app_gray_group_dto")
	private List<MiniAppGrayGroupDto> grayGroups;

	/** 
	 * 分组名称
	 */
	@ApiField("name")
	private String name;

	public void setDeviceNoList(List<String> deviceNoList) {
		this.deviceNoList = deviceNoList;
	}
	public List<String> getDeviceNoList( ) {
		return this.deviceNoList;
	}

	public void setGrayGroups(List<MiniAppGrayGroupDto> grayGroups) {
		this.grayGroups = grayGroups;
	}
	public List<MiniAppGrayGroupDto> getGrayGroups( ) {
		return this.grayGroups;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

}
