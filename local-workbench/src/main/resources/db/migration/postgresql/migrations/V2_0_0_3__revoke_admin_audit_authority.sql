DELETE FROM usergroup_authority WHERE authority_id = (SELECT id FROM authority WHERE name = 'VIEW_AUDIT_QUERIES')
                                AND group_id = (SELECT id FROM usergroup WHERE name = 'Administrators');