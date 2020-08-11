package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ArchiveFaceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.antarchive.face.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-07-22 19:50:10
 */
public class AlipayUserAntarchiveFaceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8372235573389976219L;

	/** 
	 * 返回人脸图片类型列表.若不存在则返回空列表
	 */
	@ApiListField("archive_face_list")
	@ApiField("archive_face_info")
	private List<ArchiveFaceInfo> archiveFaceList;

	/** 
	 * 是否存在本地可用比对源图片
	 */
	@ApiField("local_usable")
	private Boolean localUsable;

	/** 
	 * 是否存在远程可用比对源图片
	 */
	@ApiField("remote_usable")
	private Boolean remoteUsable;

	public void setArchiveFaceList(List<ArchiveFaceInfo> archiveFaceList) {
		this.archiveFaceList = archiveFaceList;
	}
	public List<ArchiveFaceInfo> getArchiveFaceList( ) {
		return this.archiveFaceList;
	}

	public void setLocalUsable(Boolean localUsable) {
		this.localUsable = localUsable;
	}
	public Boolean getLocalUsable( ) {
		return this.localUsable;
	}

	public void setRemoteUsable(Boolean remoteUsable) {
		this.remoteUsable = remoteUsable;
	}
	public Boolean getRemoteUsable( ) {
		return this.remoteUsable;
	}

}
