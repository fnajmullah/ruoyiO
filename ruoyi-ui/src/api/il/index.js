import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listIl(query) {
  return request({
    url: '/system/il/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getIl(ilId) {
  return request({
    url: '/system/il/' + ilId,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addIl(data) {
  return request({
    url: '/system/il',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateIl(data) {
  return request({
    url: '/system/il',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delIl(ilId) {
  return request({
    url: '/system/il/' + ilId,
    method: 'delete'
  })
}

// 导出【请填写功能名称】
export function exportIl(query) {
  return request({
    url: '/system/il/export',
    method: 'get',
    params: query
  })
}