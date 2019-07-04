package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.manage_cms.ManageCmsTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class CmsRepostiryTest extends ManageCmsTest {

    @Autowired
    CmsPageRepository cmsPageRepository;

    @Test
    public void teseFindAll(){
       List<CmsPage> cmsPages = cmsPageRepository.findAll();
       logger.info("cmsPages:========="+cmsPages.size());
    }

    @Test
    public void teseFindAllPage(){
        Pageable pageable = PageRequest.of(2,2);
        cmsPageRepository.findAll(pageable);
        List<CmsPage> cmsPages = cmsPageRepository.findAll();
        logger.info("cmsPages:========="+cmsPages);
    }
}
