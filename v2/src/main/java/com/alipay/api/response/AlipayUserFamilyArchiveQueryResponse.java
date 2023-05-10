package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FamilyArchiveDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.family.archive.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-05 04:45:10
 */
public class AlipayUserFamilyArchiveQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5136765931389266212L;

	/** 
	 * 家庭档案列表，包含档案id、档案详情等
	 */
	@ApiListField("archive_list")
	@ApiField("family_archive_detail")
	private List<FamilyArchiveDetail> archiveList;

	public void setArchiveList(List<FamilyArchiveDetail> archiveList) {
		this.archiveList = archiveList;
	}
	public List<FamilyArchiveDetail> getArchiveList( ) {
		return this.archiveList;
	}

}
