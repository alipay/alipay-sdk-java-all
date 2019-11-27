package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 崖飞测试API
 *
 * @author auto create
 * @since 1.0, 2017-11-09 15:56:05
 */
public class AlipayDataDataserviceMemberQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3485972284699258734L;

	/**
	 * 妈妈用户ID
	 */
	@ApiField("member_id")
	private Long memberId;

	/**
	 * 分页信息
	 */
	@ApiField("page_dto")
	private YafeiTestPageDTO pageDto;

	/**
	 * 权限名称
	 */
	@ApiField("permission_name")
	private String permissionName;

	/**
	 * 系统id
	 */
	@ApiField("sys_id")
	private Long sysId;

	public Long getMemberId() {
		return this.memberId;
	}
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public YafeiTestPageDTO getPageDto() {
		return this.pageDto;
	}
	public void setPageDto(YafeiTestPageDTO pageDto) {
		this.pageDto = pageDto;
	}

	public String getPermissionName() {
		return this.permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	public Long getSysId() {
		return this.sysId;
	}
	public void setSysId(Long sysId) {
		this.sysId = sysId;
	}

}
