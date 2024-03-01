package com.physiolink.backend.repository.abstracRespository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractRepository<T, ID> implements IRepository<T, ID> {

    private final Map<ID, T> entityMap = new HashMap<>();
    private static int idCounter = 1;

    @Override
    public T findById(ID id) {
        return entityMap.get(id);
    }

    @Override
    public List<T> findAll() {
        return List.copyOf(entityMap.values());
    }

    @Override
    public void save(T entity) {
        // Implementar la lógica de asignación de ID, si es necesario
        // Ejemplo: if (entity.getId() == null) entity.setId(idCounter++);
        entityMap.put(getEntityId(entity), entity);
    }

    @Override
    public void update(T entity) {
        entityMap.put(getEntityId(entity), entity);
    }

    @Override
    public void deleteById(ID id) {
        entityMap.remove(id);
    }

    // Método abstracto para obtener el ID de la entidad
    protected abstract ID getEntityId(T entity);
}
